package com.megalab.test.service.impl;

import com.megalab.test.repo.ClassesRepo;
import com.megalab.test.response.Battle;
import com.megalab.test.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    @Autowired
    private final ClassesRepo repo;

    @Override
    public Battle findClassesByParam(String res) {
        Battle battle = new Battle();
        battle.setClass_names(repo.classes(res, res));
        return battle;
    }
}
