package fetchers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.StarWarsDTO;
import java.io.IOException;
import utils.HttpUtils;

import java.util.concurrent.*;

public class StarWarsFetcher {

    private static String starWarsURL = "https://api/SWQuote/RandomStarWarsQuote";

    public static String fetchData(ExecutorService threadPool, Gson gson) throws InterruptedException, ExecutionException, TimeoutException, IOException {

        Callable<StarWarsDTO> starWarsTask = new Callable<StarWarsDTO>() {
            @Override
            public StarWarsDTO call() throws Exception {
                String starWars = HttpUtils.fetchData(starWarsURL);
                StarWarsDTO starWarsDTO = gson.fromJson(starWars, StarWarsDTO.class);
                return starWarsDTO;
            }
        };

        Future<StarWarsDTO> futureStarWars = threadPool.submit(starWarsTask);

        StarWarsDTO starWars = futureStarWars.get(5, TimeUnit.SECONDS);

        String starWarsJson = gson.toJson(starWars);

        return starWarsJson;
    }
}
