package com.personal.dashboard.controller;

import com.personal.dashboard.domain.jsonCompare.JsonCompareRequest;
import com.personal.dashboard.domain.openWeatherMap.CurrentWeatherRequest;
import com.personal.dashboard.domain.openWeatherMap.CurrentWeatherResponse;
import com.personal.dashboard.service.jsonCompare.JsonCompareService;
import com.personal.dashboard.utils.APIEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = APIEndpoints.JSON_COMPARE_API_URL)
public class JsonCompareController {

    @Autowired
    private JsonCompareService jsonCompareService;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * If given json is available inside parent json
     *
     * @param jsonCompareRequest - {@link JsonCompareRequest}
     * @return - {@link String}
     */
    @RequestMapping(value = "/ifKeyExists/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> ifKeyExistsWithinAnotherJsonEndpoint(@RequestBody(required = true)JsonCompareRequest jsonCompareRequest) {

        String response = jsonCompareService.findJsonKeyInsideAnotherJsonService(jsonCompareRequest);

        return new ResponseEntity<String>(response, HttpStatus.OK);
    }


}
