package advancedStreams.model;

import java.util.List;

public record Order(int id, Person buyer, List<Product> products) {}
