import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    void shouldCalculateForRegisteredAndUnderLimit(long amount, boolean registered, long expected) {
        BonusService service = new BonusService();

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
