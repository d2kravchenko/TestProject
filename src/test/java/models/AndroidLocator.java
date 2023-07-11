package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.openqa.selenium.By;

@Builder
@Data
@AllArgsConstructor
public class AndroidLocator {

    private By locator;
}
