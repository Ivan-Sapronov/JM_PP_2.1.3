package app.model;

import org.springframework.stereotype.Component;

/**
 * @author Ivan Sapronov
 */
@Component
public class Dog  extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
