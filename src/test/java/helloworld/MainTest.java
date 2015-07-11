package helloWorld;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {
  @Test
  public void theTruth() {
    assertThat(true, is(false));
  }
}
