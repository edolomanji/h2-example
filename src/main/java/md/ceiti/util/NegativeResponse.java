package md.ceiti.util;

import java.time.OffsetDateTime;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NegativeResponse {

    private final String message;

    private final OffsetDateTime time = OffsetDateTime.now();

}
