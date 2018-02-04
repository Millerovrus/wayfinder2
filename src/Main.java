import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        String startPoint = "Воронеж";
        String destinationPoint = "Тбилиси";
        edges.add(new Edge("Воронеж", "Москва", 15));
        edges.add(new Edge("Воронеж", "Ростов", 15));
        edges.add(new Edge("Воронеж", "Липецк", 7));
        edges.add(new Edge("Воронеж", "Курск", 9));
        edges.add(new Edge("Воронеж", "Тбилиси", 100));
        edges.add(new Edge("Москва", "Тбилиси", 75));
        edges.add(new Edge("Москва", "Кутаиси", 70));
        edges.add(new Edge("Москва", "Батуми", 80));
        edges.add(new Edge("Ростов", "Тбилиси", 60));
        edges.add(new Edge("Ростов", "Кутаиси", 73));
        edges.add(new Edge("Ростов", "Батуми", 55));
        edges.add(new Edge("Липецк", "Тбилиси", 80));
        edges.add(new Edge("Курск", "Кутаиси", 62));
        edges.add(new Edge("Кутаиси", "Тбилиси", 5));
        edges.add(new Edge("Батуми", "Тбилиси", 7));

        Algorithm a = new Algorithm();
        System.out.println(a.findWay(edges, startPoint, destinationPoint).toString());

    }
}