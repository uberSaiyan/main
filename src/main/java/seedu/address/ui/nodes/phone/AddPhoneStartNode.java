package seedu.address.ui.nodes.phone;

import seedu.address.model.phone.Phone;
import seedu.address.ui.Node;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class AddPhoneStartNode extends Node<Phone> {

    public AddPhoneStartNode(List<Phone> backingList) {
        super(backingList);
    }

    @Override
    public SortedSet<String> getValues() {
        return new TreeSet<>();
    }

}
