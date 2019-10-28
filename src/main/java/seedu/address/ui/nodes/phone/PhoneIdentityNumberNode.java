package seedu.address.ui.nodes.phone;

import seedu.address.model.phone.Phone;
import seedu.address.ui.Node;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhoneIdentityNumberNode extends Node<Phone> {

    public PhoneIdentityNumberNode(List<Phone> backingList) {
        super(backingList);
    }

    @Override
    public SortedSet<String> getValues() {
        SortedSet<String> values = new TreeSet<>();
        backingList.forEach(phone -> values.add(phone.getIdentityNumber().toString()));
        return values;
    }

}
