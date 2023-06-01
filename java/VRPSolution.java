import java.util.List;

public class VRPSolution {
    private List<List<Integer>> routes;
    double totalCost;

    public VRPSolution(List<List<Integer>> routes2) {
        this.routes = routes2;
    }

    public List<List<Integer>> getRoutes() {
        return routes;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public List<Integer> getNodes() {
        return null;
    }

    public void addNode(VRPNode randomNode) {
    }
}
