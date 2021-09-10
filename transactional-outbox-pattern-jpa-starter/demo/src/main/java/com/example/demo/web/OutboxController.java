package com.example.demo.web;

import io.github.bhuwanupadhyay.springboot.outbox.config.OutboxProperties;
import io.github.bhuwanupadhyay.springboot.outbox.domain.OutboxEvent;
import io.github.bhuwanupadhyay.springboot.outbox.domain.OutboxPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class OutboxController {

    private final OutboxPublisher eventPublisher;
    private final OutboxProperties properties;

    public OutboxController(OutboxPublisher eventPublisher, OutboxProperties properties) {
        this.eventPublisher = eventPublisher;
        this.properties = properties;
    }

    @GetMapping("/outboxes/fire")
    public ResponseEntity<Void> fire() {
        eventPublisher.fire(new DebitedEvent(BigDecimal.TEN));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/outboxes/configs")
    public ResponseEntity<OutboxProperties> getProperties() {
        return ResponseEntity.ok(properties);
    }


    public static class DebitedEvent implements OutboxEvent {

        private final BigDecimal amount;

        public DebitedEvent(BigDecimal amount) {
            this.amount = amount;
        }

        public BigDecimal getAmount() {
            return amount;
        }
    }
}