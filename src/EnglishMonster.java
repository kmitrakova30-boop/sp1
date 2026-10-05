import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class EnglishMonster extends Monster {

    private String image = "\uD83D\uDC7F"; // 👿

    private final Map<String, String> words = Map.ofEntries(
            Map.entry("bread", "хлеб"),
            Map.entry("water", "вода"),
            Map.entry("milk", "молоко"),
            Map.entry("tea", "чай"),
            Map.entry("coffee", "кофе"),
            Map.entry("meat", "мясо"),
            Map.entry("fish", "рыба"),
            Map.entry("chicken", "курица"),
            Map.entry("egg", "яйцо"),
            Map.entry("cheese", "сыр"),
            Map.entry("butter", "масло"),
            Map.entry("apple", "яблоко"),
            Map.entry("banana", "банан"),
            Map.entry("orange", "апельсин"),
            Map.entry("grape", "виноград"),
            Map.entry("lemon", "лимон"),
            Map.entry("potato", "картофель"),
            Map.entry("tomato", "помидор"),
            Map.entry("carrot", "морковь"),
            Map.entry("onion", "лук"),
            Map.entry("rice", "рис"),
            Map.entry("soup", "суп"),
            Map.entry("cake", "торт"),
            Map.entry("sugar", "сахар"),
            Map.entry("salt", "соль")
    );

    private final Random random = new Random();

    public EnglishMonster(int sizeBoard) {
        super(sizeBoard);
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задание:");

        List<String> englishWords = new ArrayList<>(words.keySet());

        String englishWord = englishWords.get(
                random.nextInt(englishWords.size())
        );

        String correctAnswer = words.get(englishWord);

        System.out.println(
                "Переведите слово \"" + englishWord + "\" на русский язык:"
        );

        Scanner scanner = new Scanner(System.in);

        String userAnswer = scanner.nextLine()
                .trim()
                .toLowerCase();

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Верно! Ты победил монстра.");
            return true;
        } else {
            System.out.println("Неверно!");
            System.out.println("Правильный ответ: " + correctAnswer);
            System.out.println("Ты проиграл эту битву!");
            return false;
        }
    }
}

