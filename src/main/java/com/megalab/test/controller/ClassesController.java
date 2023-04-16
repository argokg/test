package com.megalab.test.controller;

import com.megalab.test.service.ClassService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/classes")
@RequiredArgsConstructor
public class ClassesController {

    private final ClassService classService;


    @GetMapping("/ships")
    public ResponseEntity<?> findClasses(HttpServletRequest request){
        String res = request.getParameter("result");
        String result = request.getParameter("res");
        return ResponseEntity.ok(classService.findClassesByParam(res, result));


    }

}
