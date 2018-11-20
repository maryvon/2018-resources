package lab07;

public class Printer {

	private int inkVolume;
	private int paperVolume;

	private final int MAX_CHARS_PER_PAGE = 10;
	private int currentPageCharacterCounter;

	public Printer() {
		inkVolume = 100;
		paperVolume = 11;
		currentPageCharacterCounter = 0;
	}

	public boolean print(String text) {
		System.out.println("[PRINTER] Printing..");
		for (Character character: text.toCharArray()) {
			if (currentPageCharacterCounter == MAX_CHARS_PER_PAGE) {
				currentPageCharacterCounter = 0;
				paperVolume--;
			}
			if (canPrint()) {
				System.out.print(character);
				inkVolume--;
				currentPageCharacterCounter++;
			} else {
				if (paperVolume == 0) {
					throw new OutOfPaperException();
				} else if (inkVolume == 0) {
					throw new OutOfInkException();
				}
				System.out.println();
				System.out.println("[PRINTER] An error occured..");
				return false;
			}
		}
		System.out.println();
		System.out.println("[PRINTER] Successfully printed text.");
		return true;
	}

	private boolean canPrint() {
		return paperVolume != 0 && inkVolume != 0;
	}
}
