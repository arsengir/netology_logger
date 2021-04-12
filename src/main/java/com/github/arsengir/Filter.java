package com.github.arsengir;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer item : source) {
            if (item < treshold) {
                logger.log("Элемент \"" + item + "\" не проходит");
            } else {
                result.add(item);
                logger.log("Элемент \"" + item + "\" проходит");
            }
        }
        logger.log(String.format("Прошло фильтр %d элемента из %d", result.size(), source.size()));

        return result;
    }
}
