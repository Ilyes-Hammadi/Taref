package com.cortexia.taref.data;

import com.cortexia.taref.R;
import com.cortexia.taref.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilyes on 07/10/15.
 */
public class ItemsData {


    public static List<Item> getAnimals() {
        List<Item> animals = new ArrayList<>();


        animals.add(new Item("Polar Bear", "The Polar Bear is the world's largest bear. Females can weigh over 650 lbs (300kg), while males can weigh more than double that.Polar bears are great swimmers; they have been seen in open waters hundreds of miles from land. This bear's very thick fur keeps its skin dry when it swims so it can stay warm. Their paws prevent the bears from slipping on the ice.Males are active year round, while females usually hibernate in ice dens during the winter. A female polar bear will give birth to their young inside of these ice dens, and then emerge in the spring.During summer months, polar bears will eat berries and rodents. During the winter, they eat seals"
                , R.drawable.polar_bear));

        animals.add(new Item("Lynx", "The Lynx has a very short tail and tufted ears. This makes it look different from other cats. Lynx live in the forest. They eat a wide variety of birds and small mammals. In North America, their diet consists largely of snowshoe hares. The North American lynxes have large round paws that help them walk on top of snow.Experts disagree on the number of lynx species. Opinions range from their being only one species of lynx to as many as three."
                , R.drawable.lynx));

        animals.add(new Item("Elephant", "The African Elephant is the world's largest land animal. Adult males can weigh as much as six tons. They drink more than 25 gallons (100 liters) of water each day and eat up to 650 lbs. (300kg) of food.The trunks of African elephants have two tips which they use like fingertips to pick things up. African elephant calves feed on milk for up to 18 months, and do not breed until at least 11 years old."
                , R.drawable.elephant));

        animals.add(new Item("Coyote", "A coyote's diet consists of fruit, insects, snakes and dead remains. They are also well know for attacking farm animals. In the spring the female gives birth to a litter of about six pups in a burrow. The father will bring them food while they stay safely under ground."
                , R.drawable.coyote));

        animals.add(new Item("llama", "Like guanacos and vicunas, llamas live in the Andes Mountains of South America. They are the largest of these three animal species. Llamas are a domesticated descendant of guanacos. For thousands of years, llamas have been used as pack animals. They are strong, and are able to move along narrow mountain paths with ease. They also were used for food, leather, and their fur, which can be made into rope.",
                R.drawable.llama));

        return animals;
    }


}
