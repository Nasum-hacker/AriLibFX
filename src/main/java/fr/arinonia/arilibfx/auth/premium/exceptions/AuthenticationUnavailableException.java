package fr.arinonia.arilibfx.auth.premium.exceptions;

import fr.arinonia.arilibfx.auth.premium.responses.ErrorResponse;

/**
 * Created by Arinonia on 10/04/2020 inside the package - fr.arinonia.arilibfx.auth.premium.exceptions
 */
public class AuthenticationUnavailableException extends Exception {

    public AuthenticationUnavailableException(ErrorResponse error) {

    }
}
