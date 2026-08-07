
package com.college.gatepass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {
    @Autowired
    private VisitorRepository visitorRepository;

    @PostMapping("/register")
    public ResponseEntity<?> registerVisitor(@RequestBody Visitor visitor) {
        Visitor saved = visitorRepository.save(visitor);
        return ResponseEntity.status(201).body(new ApiResponse("success", "Visitor registered", saved));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getVisitor(@PathVariable Long id) {
        return visitorRepository.findById(id)
                .map(v -> ResponseEntity.ok(new ApiResponse("success", "Visitor found", v)))
                .orElse(ResponseEntity.status(404).body(new ApiResponse("error", "Visitor not found", null)));
    }

    @GetMapping
    public ResponseEntity<?> listVisitors() {
        List<Visitor> visitors = visitorRepository.findAll();
        return ResponseEntity.ok(new ApiResponse("success", "Visitors retrieved", visitors));
    }
}