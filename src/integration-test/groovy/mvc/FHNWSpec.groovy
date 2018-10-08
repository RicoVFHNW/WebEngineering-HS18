package mvc

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class FHNWSpec extends GebSpec {

    // Defines a when-then workflow
    void "FHNW calculation"() {
        when:
        go 'https://www.fhnw.ch/de/studium/informatik'
        then:
        title == "Informatik | FHNW"
    }
}
