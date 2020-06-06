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
        .getForObject("http://ps-jx-overidden-pipeline-jx-staging.35.192.49.117.nip.io", String.class);

    // Then
    assertThat(responseBody).isEqualTo("Hello there, World!");
  }

}
