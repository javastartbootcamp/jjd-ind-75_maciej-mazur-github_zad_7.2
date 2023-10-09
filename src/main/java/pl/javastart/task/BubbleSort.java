package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int compareCount = 0;
        boolean wasChanged;
        int endIndex = inputArray.length - 1;

        do {
            wasChanged = false;
            for (int i = 0; i < endIndex; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    wasChanged = true;
                }
                compareCount++;
            }
            endIndex--;
        } while (wasChanged);

        return compareCount;
    }
}
