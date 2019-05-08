let socket = io.connect({transports: ['websocket']});
socket.on('gameState', parseGameState);

const tileSize = 30;

let canvas = document.getElementById("canvas");
let context = canvas.getContext("2d");
context.globalCompositeOperation = 'source-over';

function parseGameState(event) {
    console.log(event);
    const gameState = JSON.parse(event);

    drawGameBoard(gameState['gridSize']);

    placeSquare(gameState['start']['x'], gameState['start']['y'], 'red');

    const color = 'black';

    placeSquare(gameState['home']['x'], gameState['home']['y'], color);

    for (let runner of gameState['runners']) {
        placeCircle(runner['x'], runner['y'], runner['id'] === socket.id ? '#ffff00' : '#56bcff', 5.0);
    }

    for (let wall of gameState['walls']) {
        placeSquare(wall['x'], wall['y'], '#7B2918');
    }

}


function drawGameBoard(gridSize) {

    const gridWidth = gridSize['x'];
    const gridHeight = gridSize['y'];

    context.fillStyle = '#5EC512';
    context.fillRect(0, 0, gridWidth * tileSize, gridHeight * tileSize);

    canvas.setAttribute("width", gridWidth * tileSize);
    canvas.setAttribute("height", gridHeight * tileSize);

    context.fillStyle = '#5EC512';
    context.fillRect(0, 0, 750,750 );


    context.strokeStyle = '#5EC512';

    for (let j = 0; j <= gridWidth; j++) {
        context.beginPath();
        context.moveTo(j * tileSize, 0);
        context.lineTo(j * tileSize, gridHeight * tileSize);
        context.stroke();
    }
    for (let k = 0; k <= gridHeight; k++) {
        context.beginPath();
        context.moveTo(0, k * tileSize);
        context.lineTo(gridWidth * tileSize, k * tileSize);
        context.stroke();
    }

}

function placeSquare(x, y, color) {
    context.fillStyle = color;
    context.fillRect(x * tileSize, y * tileSize, tileSize, tileSize);

}


function placeCircle(x, y, color, size) {
    context.fillStyle = color;
    context.beginPath();
    context.arc(x * tileSize,
        y * tileSize,
        size / 10.0 * tileSize,
        0,
        2 * Math.PI);
    context.fill();
    context.strokeStyle = 'black';
    context.stroke();
}




