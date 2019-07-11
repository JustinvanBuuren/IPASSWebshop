let apiBaseUrl = 'http://localhost:8080/ipass/api';
let apiGamesUrl = apiBaseUrl + '/games';

/**
 * @param num
 * @returns {string}
 * @desc formatteert een getal naar een getal
 * met 2 decimalen en een euro teken
 */
function currencyFormat(num) {
    return '€' + num.toFixed(2).replace(/(\d)(?=(\d{3})+(?!\d))/g, '€1,')
}


/**
 * @param text
 * @param length
 * @returns {string}
 * @desc verkort de opgegeven tekst tot de
 * opgegeven maximale lengte
 */
function limitText(text, length) {
    if(text.length === 0) {
        return 'Geen omschrijving';
    }
    text = text.substr(0, length);
    return text.substr(0, Math.min(text.length, text.lastIndexOf(" "))) + '...';
}


/**
 * @param sParam
 * @returns {*}
 * @desc haalt de opgegeven url parameter uit
 * de url
 */
function getUrlParameter(sParam) {
    let sPageURL = window.location.search.substring(1),
        sURLVariables = sPageURL.split('&'),
        sParameterName,
        i;

    for (i = 0; i < sURLVariables.length; i++) {
        sParameterName = sURLVariables[i].split('=');

        if (sParameterName[0] === sParam) {
            return sParameterName[1] === undefined ? true : decodeURIComponent(sParameterName[1]);
        }
    }
}


/**
 * @returns {string}
 * @desc returned de loader (gif) terug
 */
function loader() {
    return "<img src='img/loader.gif' alt='Loading..'/>";
}