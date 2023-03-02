import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задача на количество уникальных слов в предложении.");

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
        System.out.println(sentence);

        int k = sentence.length();
        System.out.println(k);

        String[] s = sentence.split(" ");
        int w = s.length;
        System.out.println("Wieviele Wörter haben wir in dem Satz SENTENCE: *** " + w);

        HashSet<String> wordsOfSentence = new HashSet<String>();

        for ( int i = 0  ; i < s.length ; i++ ) {
            wordsOfSentence.add(s[i]); // HashSet , будет принимать внутрь только УНИКАЛЬНЫЕ слова
        }
        int t = wordsOfSentence.size();
        System.out.println("Количество уникальных слов в предложении Л.Н. Толстого: " + t);

    }
}