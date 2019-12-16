package org.optaplanner.examples.vehiclerouting.domain.solver;
import java.util.Comparator;
import org.optaplanner.examples.vehiclerouting.domain.Customer;

public class TK_LatitudeCustomerDifficultyComparator extends LatitudeCustomerDifficultyComparator 
{
    private static final Comparator<Customer> COMPARATOR =
            Comparator.comparingDouble((Customer customer) -> customer.getLocation().getLatitude())
                    .thenComparingDouble(customer -> customer.getLocation().getLongitude())
                    .thenComparingInt(Customer::getDemand)
                    .thenComparingLong(Customer::getId);

    public int compare(Customer a, Customer b) 
    {
        return COMPARATOR.compare(a, b);
    }
}