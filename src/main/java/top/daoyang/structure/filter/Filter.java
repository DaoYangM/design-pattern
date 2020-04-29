package top.daoyang.structure.filter;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 过滤器模式
 */
public class Filter {

    @Data
    @RequiredArgsConstructor
    public static class Rubbish {
        private final boolean harm;

        private final boolean dry;

        private final boolean wet;

        private final boolean recycled;
    }

    public interface RubbishFilter {
        List<Rubbish> filterRubbish(List<Rubbish> rubbishes);
    }

    public static class HarmRubbishFilter implements RubbishFilter {

        @Override
        public List<Rubbish> filterRubbish(List<Rubbish> rubbishes) {
            return rubbishes.stream().filter(rubbish -> rubbish.dry).collect(Collectors.toList());
        }
    }

    public static class DryRubbishFilter implements RubbishFilter {

        @Override
        public List<Rubbish> filterRubbish(List<Rubbish> rubbishes) {
            return rubbishes.stream().filter(rubbish -> rubbish.dry).collect(Collectors.toList());
        }
    }
}
