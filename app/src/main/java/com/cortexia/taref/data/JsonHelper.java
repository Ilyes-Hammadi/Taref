package com.cortexia.taref.data;

import com.cortexia.taref.model.Item;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilyes on 22/09/15.
 */
public class JsonHelper {

    JSONObject jsonObject;

    public JsonHelper() {
        try {
            String json = "{\n" +
                    "  \"animeaux\": [\n" +
                    "    {\n" +
                    "      \"nom\": \"Polar Bear\",\n" +
                    "      \"text\": \"The Polar Bear is the world's largest bear. Females can weigh over 650 lbs (300kg), while males can weigh more than double that.Polar bears are great swimmers; they have been seen in open waters hundreds of miles from land. This bear's very thick fur keeps its skin dry when it swims so it can stay warm. Their paws prevent the bears from slipping on the ice.Males are active year round, while females usually hibernate in ice dens during the winter. A female polar bear will give birth to their young inside of these ice dens, and then emerge in the spring.During summer months, polar bears will eat berries and rodents. During the winter, they eat seals\",\n" +
                    "      \"image\": \"\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\": \"Lynx\",\n" +
                    "      \"text\": \"The Lynx has a very short tail and tufted ears. This makes it look different from other cats. Lynx live in the forest. They eat a wide variety of birds and small mammals. In North America, their diet consists largely of snowshoe hares. The North American lynxes have large round paws that help them walk on top of snow.Experts disagree on the number of lynx species. Opinions range from their being only one species of lynx to as many as three.\",\n" +
                    "      \"image\": \"\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\": \"Lion\",\n" +
                    "      \"text\": \"After the tiger, the lion is the largest cat. A typical lion group, or pride, consists of about fifteen animals; two or three are males and the rest are females along with their young. Lions hunt in groups. The females usually do the job of hunting, but after a kill the males soon show up to eat, too. Lions will eat just about anything they can find, including lizards, tortoises and dead remains. Lions used to roam all over Europe and Asia and Africa. Now, a few live in northwestern India while they majority of them live in the plains and woodlands of Africa.\",\n" +
                    "      \"image\": \"\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\": \"Elephant\",\n" +
                    "      \"text\": \"The African Elephant is the world's largest land animal. Adult males can weigh as much as six tons. They drink more than 25 gallons (100 liters) of water each day and eat up to 650 lbs. (300kg) of food.The trunks of African elephants have two tips which they use like fingertips to pick things up. African elephant calves feed on milk for up to 18 months, and do not breed until at least 11 years old.\",\n" +
                    "      \"image\": \"\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\": \"Dingo\",\n" +
                    "      \"text\": \"Australia does not have any native dogs of their own, but the dingo was brought there thousands of years ago. Dingos cannot bark. They have extra-large paws and their ears are always upright. Ranchers in Australia had a hard time farming because dingos attacked their animals. The farming area of southeastern Australia has a dingo-proof fence more than 3,000 miles (5,000km) long.\",\n" +
                    "      \"image\": \"\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\": \"Coyote\",\n" +
                    "      \"text\": \"A coyote's diet consists of fruit, insects, snakes and dead remains. They are also well know for attacking farm animals. In the spring the female gives birth to a litter of about six pups in a burrow. The father will bring them food while they stay safely under ground.\",\n" +
                    "      \"image\": \"\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\": \"llama\",\n" +
                    "      \"text\": \"Like guanacos and vicunas, llamas live in the Andes Mountains of South America. They are the largest of these three animal species. Llamas are a domesticated descendant of guanacos. For thousands of years, llamas have been used as pack animals. They are strong, and are able to move along narrow mountain paths with ease. They also were used for food, leather, and their fur, which can be made into rope.\",\n" +
                    "      \"image\": \"\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"planet\":[\n" +
                    "    {\n" +
                    "      \"nom\" : \"\",\n" +
                    "      \"text\" : \"\",\n" +
                    "      \"image\" : \"\"\n" +
                    "\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\" : \"\",\n" +
                    "      \"text\" : \"\",\n" +
                    "      \"image\" : \"\"\n" +
                    "\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\" : \"\",\n" +
                    "      \"text\" : \"\",\n" +
                    "      \"image\" : \"\"\n" +
                    "\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\" : \"\",\n" +
                    "      \"text\" : \"\",\n" +
                    "      \"image\" : \"\"\n" +
                    "\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"nom\" : \"\",\n" +
                    "      \"text\" : \"\",\n" +
                    "      \"image\" : \"\"\n" +
                    "\n" +
                    "    }\n" +
                    "  ]\n" +
                    "\n" +
                    "}";
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private List<Item> getItems(String itemsKey) {
        List<Item> items = new ArrayList<>();
        try {

            // get the arry key
            JSONArray array = jsonObject.getJSONArray("animeaux");

            // for each element on the array we exract the name and the text
            // TODO: 22/09/15 add exracting the iamge after downloading the images

            for (int i = 0; i < array.length(); i++) {
                // get the current object
                JSONObject temp = array.getJSONObject(i);

                // parce the data into a temp model
                Item item = new Item();
                item.setName(temp.getString("nom"));
                item.setText(temp.getString("text"));

                // add the item to list items
                items.add(item);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return items;
    }

    public List<Item> getAnimals() {
        return getItems("animeaux");
    }


}
