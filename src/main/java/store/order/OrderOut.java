package store.order;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true)
public record OrderOut(
    String id,
    LocalDateTime date,
    List<ItemOut> items,
    double total
) {}
