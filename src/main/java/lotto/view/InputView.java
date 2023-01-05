package lotto.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public int getExpenseInput() {
        System.out.println("구입 금액을 입력해 주세요.");
        return Integer.parseInt(sc.nextLine());
    }

    public List<Integer> getAnswerLottoInput() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        return getLottoInput();
    }

    public List<Integer> getUserLottoInput() {
        System.out.println("로또 번호를 입력해 주세요.");
        return getLottoInput();
    }

    public int getGenerateOptionInput() {
        System.out.println("자동 생성은 1, 수동 생성은 2를 입력해주세요");
        String generateOption = sc.nextLine();
        return Integer.parseInt(generateOption);
    }

    private List<Integer> getLottoInput() {
        String answerNumbers = sc.nextLine();
        return Arrays.stream(answerNumbers.split("[\\s,]+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int getBonusBallInput() {
        System.out.println("보너스 볼을 입력해 주세요.");
        return Integer.parseInt(sc.nextLine());
    }
}
