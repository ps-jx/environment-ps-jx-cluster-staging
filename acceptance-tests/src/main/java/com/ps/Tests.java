package com.ps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
public class Tests {

  @Test
  public void should() {
    // Given
    final RestTemplate restTemplate = new RestTemplate();

    // When
    String responseBody = restTemplate
        .getForObject("ps-jx-overidden-pipeline-staging.35.192.49.117.nip.io/greeting", String.class);

    // Then
    assertThat(responseBody).isEqualTo("Hello world");
  }

}
