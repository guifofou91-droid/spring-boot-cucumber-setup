package com.lovedev.cucumber.glue;

import com.lovedev.cucumber.model.Employer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.springframework.test.web.servlet.client.RestTestClient;

@NoArgsConstructor
public class EmployerStep {
    private final RestTestClient restTestClient = RestTestClient.bindToServer()
            .baseUrl("http://localhost:8080")
            .build();
    private RestTestClient.ResponseSpec response;
    private Employer employer;

    @When("I save the employer with all the information")
    public void iSaveTheEmployerWithAllTheInformation() {
        employer = Employer.builder()
                .id(1)
                .name("John")
                .rule("AGENT")
                .build();
    }

    @Then("The employer is save and the id is return")
    public void theEmployerIsSaveAndTheIdIsReturn() {
        String url = "/emplyers";
        response = restTestClient.post().uri(url)
                .body(employer)
                .exchange();

    }

    @And("the status code is created")
    public void theStatusCodeIsCreated() {
        Assertions.assertNotNull(response);
        Assertions.assertNotNull(response.expectStatus());

    }
}
