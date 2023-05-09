import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CustomerAddInvoiceTest {

    private String customerName;
    private String requestDate;
    private String requestTime;
    private int requestStatus;

    @Given("that the customer {string} is logged in")
    public void that_the_customer_is_logged_in(String customerName) {
        this.customerName = customerName;
    }

    @Given("they have a request with date {string} and time is {string}")
    public void they_have_a_request_with_date_and_time_is(String requestDate, String requestTime) {
        this.requestDate = requestDate;
        this.requestTime = requestTime;
    }

    @Given("its status is {int}")
    public void its_status_is(Integer requestStatus) {
        this.requestStatus = requestStatus;
    }

    @When("the customer tries to add the invoice")
    public void the_customer_tries_to_add_the_invoice() {
        // Some code to add the invoice
    }

    @Then("the invoice can be generated")
    public void the_invoice_can_be_generated() {
        Assert.assertEquals("The invoice cannot be generated for the request status: " + requestStatus,
                1, requestStatus);
    }

    @Then("the invoice is generated")
    public void the_invoice_is_generated() {
        // Some code to check that the invoice is generated
    }

    @Given("they do not have a request")
    public void they_do_not_have_a_request() {
        requestDate = null;
        requestTime = null;
        requestStatus = 0;
    }

    @Then("the invoice cannot be generated")
    public void the_invoice_cannot_be_generated() {
        Assert.assertNull("The invoice can be generated when there is no request",
                requestDate);
        Assert.assertNull("The invoice can be generated when there is no request",
                requestTime);
        Assert.assertEquals("The invoice can be generated when there is no request",
                0, requestStatus);
    }

    @Then("the invoice is not generated")
    public void the_invoice_is_not_generated() {
        // Some code to check that the invoice is not generated
    }
}
