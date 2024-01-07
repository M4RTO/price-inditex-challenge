package com.inditex.price.archunit;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "com.inditex.price", importOptions = ImportOption.DoNotIncludeTests.class)
@SuppressWarnings("squid:S2187")
public class CodingRulesTest {

    @ArchTest
    public static final ArchRule exceptions_should_respect_naming_convention =
            classes()
                    .that().resideInAPackage("..exception..")
                    .should().haveSimpleNameEndingWith("Exception");

    @ArchTest
    static ArchRule no_generic_exceptions = GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;

    @ArchTest
    static ArchRule no_standard_streams = GeneralCodingRules.NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS;

    @ArchTest
    static ArchRule no_java_logging = GeneralCodingRules.NO_CLASSES_SHOULD_USE_JAVA_UTIL_LOGGING;

    @ArchTest
    static ArchRule no_jodatime = GeneralCodingRules.NO_CLASSES_SHOULD_USE_JODATIME;

    @ArchTest
    static ArchRule classes_must_not_be_suffixed_with_impl =
            noClasses()
                    .should().haveSimpleNameEndingWith("Impl")
                    .because("¿Y si mejor usamos interfaces?");

}
