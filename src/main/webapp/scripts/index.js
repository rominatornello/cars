/**
 * Created by romina.tornello on 3/6/2015.
 */
/***
var PIXI = require('pixi.js');
var renderer = new PIXI.CanvasRenderer(window.innerWidth, window.innerHeight);
document.body.appendChild(renderer.view);
var stage = new PIXI.Stage;
var carTexture = PIXI.Texture.fromImage('http://2.bp.blogspot.com/-CX3Vwis9tAo/Tks88ooyg1I/AAAAAAAAAKY/jBazqkM91lU/s1600/cars.jpg');
var car = new PIXI.Sprite(carTexture);
car.position.x = window.innerWidth / 2 - 150;
car.position.y = window.innerHeight / 2 - 150;
stage.addChild(car);

function draw() {
    renderer.render(stage);
    requestAnimationFrame(draw);
}

draw();