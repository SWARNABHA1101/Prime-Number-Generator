package com.jaletechs.png.controller;

import com.jaletechs.png.model.GenerationResponse;

/**
 * Created by jaletechs on 2019-05-30.
 */
public interface GenerationStrategy {

    GenerationResponse generate(int start, int end);

}
