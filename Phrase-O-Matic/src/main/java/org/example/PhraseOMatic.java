package org.example;

import java.util.Random;
public class PhraseOMatic {
    public static void main(String[] args) {
        String wordListOne[] = {"agnostic", "opinionated",
                "voice activated", "haptically driven",
                "extensible", "reactive", "agent based", "functional",
                "AI enabled", "strongly typed"

        };

        String wordListTwo[] = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub",
                "IoT", "cloud-native", "service oriented",
                "containerized", "serverless", "microservices",
                "distributed ledger"

        };

        String wordListThree[] = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline",
                "service mesh", "architecture", "perspective",
                "design", "orientation"

        };

        Random randomGenerator = new Random();

        int firstRandomList = randomGenerator.nextInt(wordListOne.length);
        int secondRandomList = randomGenerator.nextInt(wordListTwo.length);
        int thirdRandomList = randomGenerator.nextInt(wordListThree.length);

        String phrase = wordListOne[firstRandomList] + " "
                + wordListTwo[secondRandomList] + " "
                + wordListThree[thirdRandomList];

        System.out.println("What we need is a " + phrase);
    }
}