package leetcode75;

/**
 * DistanceBetweenBusStops
 */
public class DistanceBetweenBusStops {

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if (destination > start) {
            int temp = 0;

            temp = start;
            start = destination;
            destination = temp;
        }

        int totaldistance = 0;
        int firstdistance = 0;

        for (int i = 0; i <= distance.length - 1; i++) {
            totaldistance = totaldistance + distance[i];
            if (i >= start && i < destination) {
                firstdistance = firstdistance + distance[i];
            }
        }
        return Math.min(firstdistance, totaldistance - firstdistance);
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4 };
        int answer = distanceBetweenBusStops(array, 0, 3);
        System.out.println(answer);
    }

}