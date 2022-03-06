public class LegoBricks {
    public static void main(String[] args) {
        int amountOfBricks = 89;
        int containerCapacity = 6;

        int numberOfFullContainers = amountOfBricks/containerCapacity;
        int totalNumberOfContainers = (numberOfFullContainers + 1);
        int numberOfRemainingBlocks = amountOfBricks%containerCapacity;

        System.out.println("There are "+ numberOfFullContainers+ " full containers.");
        System.out.println("There are "+ totalNumberOfContainers+ " in total.");
        System.out.println("There are "+numberOfRemainingBlocks+ " in the container that is not completely full.");
    }
}
