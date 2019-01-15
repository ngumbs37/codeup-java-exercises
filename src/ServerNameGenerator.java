public class ServerNameGenerator {
    public static void main(String[] args) {
        String adjectives[] = {"attractive",
                               "bald",
                               "beautiful",
                               "chubby",
                               "clean",
                               "dazzling",
                               "elegant",
                               "fancy",
                               "fit",
                               "glamorous",
                               "gorgeous",
                               "handsome",
                               "magnificent",
                               "muscular",
                               "plain"};

        String nouns[] = {"area",
                          "book",
                          "business",
                          "case",
                          "child",
                          "company",
                          "country",
                          "day",
                          "eye",
                          "fact",
                          "family",
                          "government",
                          "group",
                          "hand",
                          "home",
                          "job",
                          "life",
                          "lot",
                          "man",
                          "money",
                          "month",
                          "mother",
                          "night",
                          "number",
                          "part",
                          "people",
                          "place",
                          "point",
                          "problem",
                          "program",
                          "question",
                          "right",
                          "room",
                          "school",
                          "state",
                          "story",
                          "student",
                          "study",
                          "system",
                          "thing",
                          "time",
                          "water",
                          "way",
                          "week",
                          "woman",
                          "word",
                          "work",
                          "world",
                          "year"};

        System.out.println(getRandom(adjectives, nouns));

    }

    public static String getRandom(String[] adj, String[]  nouns ){
        return adj[ranNum(adj.length)] +"-"+ nouns[ranNum(nouns.length)];
    }

    static int ranNum(int num){
        return (int) Math.ceil(Math.random()* num);
    }
}
