package com.example;

public class Jokes {
    private  String jokes[] =new String [] {
            "I bought one of those tapes to teach you Spanish in your sleep. During the night, the tape skipped. Now I can only stutter in Spanish.",
            "My girlfriend and I often laugh about how competitive we are.\n" +
                    "\n" +
                    "But I laugh more."
            ,


            "What do you call 8 hobbits /? A hobbyte"
            ,
            "    Why did the developer go broke/? Because he used up all his cache"
            ,
            "An SEO expert walks into a bar, bars, pub, tavern,public house, Irish pub, drinks, beer, alcohol"
            ,"Can a kangaroo jump higher than a house? \n" +
            "-\n" +
            "Of course, a house doesn’t jump at all.",

            "What is the difference between a snowman and a snowwoman?\n" +
                    "-\n" +
                    "Snowballs.\n" +
                    "\n" +
                    "Check out this really funny jokes: http://www.short-funny.com/#ixzz4nNpZ0aHc"
            ,
            "\n" +
                    "\"Mom, where do tampons go?\"\n" +
                    "\n" +
                    "\"Where the babies come from, darling.\"\n" +
                    "\n" +
                    "\"In the stork?\"\n" +
                    "\n" +
                    "Check out this really funny jokes: http://www.short-funny.com/#ixzz4nNpgdSvz"
    };
    public  String getJoke()
    {
        return jokes[(int)(Math.random()*6)];
    }
}
