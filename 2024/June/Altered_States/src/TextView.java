public final class TextView {
    public TextView() {
    }

    public final int askForNumberOfRows() {
        System.out.print("Enter number of rows of grid (minimum 1: ");
        return InputUtil.readIntFromUser();
    }

    public final int askForNumberOfColumns() {
        System.out.print("Enter number of columns of grid (minimum 1): ");
        return InputUtil.readIntFromUser();
    }

    public final String askForGridString() {
        System.out.print("Enter grid letters: ");
        return InputUtil.readStringFromUser();
    }

    public void printGridStates(Grid grid) {
        System.out.println("States in grid:");
        for (String state : grid.getStatesList()) {
            System.out.println(state);
        }
    }
}
