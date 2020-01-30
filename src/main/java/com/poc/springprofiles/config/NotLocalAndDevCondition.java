package com.poc.springprofiles.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.core.type.AnnotatedTypeMetadata;

//TODO: Implement NotLocalAndDevCondition and test its behaviour
//NOT USING

public class NotLocalAndDevCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            Environment environment = context.getEnvironment();
            String[] profiles = environment.getActiveProfiles();

            return true;
        }
    }

