package org.optaplanner.examples.vehiclerouting.domain.solver;
import static java.util.Comparator.comparingLong;
import java.util.Comparator;
import org.optaplanner.examples.vehiclerouting.domain.Customer;
import org.optaplanner.examples.vehiclerouting.domain.Depot;
import org.optaplanner.examples.vehiclerouting.domain.VehicleRoutingSolution;
import org.optaplanner.examples.vehiclerouting.domain.solver.DepotDistanceCustomerDifficultyWeightFactory.DepotDistanceCustomerDifficultyWeight;

public class TK_DepotDistanceCustomerDifficultyWeightFactory extends DepotDistanceCustomerDifficultyWeightFactory
{

    public static class DepotDistanceCustomerDifficultyWeight
            implements Comparable<DepotDistanceCustomerDifficultyWeight> {

        private static final Comparator<DepotDistanceCustomerDifficultyWeight> COMPARATOR =
                // Ascending (further from the depot are more difficult)
                comparingLong((DepotDistanceCustomerDifficultyWeight weight) -> weight.depotRoundTripDistance)
                        .thenComparingInt(weight -> weight.customer.getDemand())
                        .thenComparingDouble(weight -> weight.customer.getLocation().getLatitude())
                        .thenComparingDouble(weight -> weight.customer.getLocation().getLongitude())
                        .thenComparing(weight -> weight.customer, comparingLong(Customer::getId));

        private final Customer customer;
        private final long depotRoundTripDistance;

        public DepotDistanceCustomerDifficultyWeight(Customer customer,
                long depotRoundTripDistance) {
            this.customer = customer;
            this.depotRoundTripDistance = depotRoundTripDistance;
        }

        @Override
        public int compareTo(DepotDistanceCustomerDifficultyWeight other) {
            return COMPARATOR.compare(this,other);
        }
    }
}
