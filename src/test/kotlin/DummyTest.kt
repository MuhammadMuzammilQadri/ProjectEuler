import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class DummyTest() {
  
  lateinit var problem: Dummy
  
  @BeforeEach
  fun setUp() {
    problem = Dummy()
  }
  
  @Test
  fun testCases() {
    assertEquals(intArrayOf(3), problem.solve(3))
  }
}
