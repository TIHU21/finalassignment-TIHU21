export default class SnakeService {
    async getSnake() {

            return fetch("/restservices/snake")
            .then(response => response.json())

    //TODO: haal deze data van de server
    }

    async updateSnake(updatedSnake) {
        //TODO: update je slang aan de server-kant met de nieuwe gegevens
        return Promise.resolve();
    }
}
