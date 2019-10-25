package seedu.address.ui;

import seedu.address.logic.Logic;
import seedu.address.ui.graphs.AddCustomerGraph;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GraphGenerator {

    private List<Graph> graphs;

    public GraphGenerator(Logic logic) {
        graphs = Arrays.asList(
                new AddCustomerGraph(logic.getFilteredCustomerList())
        );
    }

    public Optional<Graph> getGraph(String name) {
        return graphs.stream()
                .filter(graph -> graph.getCommandWord().equals(name))
                .findFirst();
    }

}
