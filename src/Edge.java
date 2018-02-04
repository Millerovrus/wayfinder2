public class Edge {
    private String startPoint;
    private String destinationPoint;
    private double weight;

    public String getStartPoint() {
        return startPoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public double getWeight() {
        return weight;
    }

    public Edge(String startPoint, String destinationPoint, double weight) {
        this.startPoint = startPoint;
        this.destinationPoint = destinationPoint;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "startPoint='" + startPoint + '\'' +
                ", destinationPoint='" + destinationPoint + '\'' +
                ", weight=" + weight +
                '}';
    }
}
