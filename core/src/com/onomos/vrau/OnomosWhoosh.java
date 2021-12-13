/*
----------------------------------------------------------------
Nome do Jogo: OnomosWhoosh
----------------------------------------------------------------
Grupo:	- Athos Ferraz Cunha
		- Rodrigo Herstler Albernaz
		- Sérgio Murillo da Costa Faria
----------------------------------------------------------------                                                      

                                      ████████████████                              
                                    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒████                            
                                  ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓                          
                                ██▒▒██████████▓▓▓▓▒▒▒▒▓▓▓▓██                        
                                ████  ░░  ░░░░████▓▓▒▒▒▒▓▓▓▓██                      
                                ██░░░░░░░░░░░░▒▒██▓▓▒▒▒▒▒▒▓▓▓▓██                    
                                ██████░░░░██████████▓▓▒▒████▓▓▓▓██                  
                              ██░░██░░    ░░██░░▒▒██▓▓██░░██▒▒▓▓██                  
                              ██  ░░░░░░░░  ░░░░▒▒████▓▓████▒▒▓▓▓▓██                
                            ██      ██░░██  ░░  ░░░░████▓▓▒▒▒▒▒▒▓▓████              
                          ██                  ░░░░░░░░██▒▒▓▓▒▒▒▒████████            
  Commandos do Jogo:      ████████░░    ░░░░░░░░░░░░░░████▓▓▒▒▒▒████▓▓████          
  Z - Digitar angulo        ██░░░░░░░░░░░░░░░░░░░░░░░░▒▒████▒▒▒▒██▓▓▒▒▒▒▓▓████        
  X - Digitar velocidade    ██░░░░░░▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██▓▓      
                            ██████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██      
                          ██▒▒██▓▓▓▓██████████████▓▓▓▓▒▒▓▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒████    
          ██████        ██▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▓▒▒▒▒▒▒▒▒▓▓████  
          ██    ██    ██▒▒▒▒▒▒▒▒▒▒▒▒████████████▒▒▓▓▒▒▒▒▒▒▒▒▒▒██▓▓▓▓▒▒▒▒▒▒▒▒▓▓████  
        ██░░  ░░░░████▒▒▒▒▒▒▒▒▒▒▒▒██░░░░░░░░░░░░████▒▒▒▒▒▒▒▒▒▒▓▓██▓▓▓▓▒▒▒▒▒▒▒▒▓▓████
        ██  ░░░░██████▒▒▒▒▒▒██▒▒▒▒██░░      ░░░░░░████▒▒▒▒▒▒▒▒▓▓████▓▓▓▓▒▒▒▒▒▒▒▒▓▓██
        ██░░░░▒▒██▒▒▒▒██▒▒▓▓██▒▒██░░▒▒░░██  ░░▒▒░░░░██▒▒▓▓▒▒▓▓██████████▒▒▒▒▓▓▒▒▓▓██
          ████████▒▒▒▒▓▓▓▓▓▓██▒▒████████▒▒████████████▒▒▓▓▓▓██████████████▒▒▒▒▒▒▒▒▓▓
          ██▒▒██▒▒▒▒▒▒▓▓▓▓████▓▓▒▒████      ░░██████▓▓▓▓▓▓██▒▒▒▒▒▒▓▓██████▓▓▒▒████▓▓
          ██▒▒██▒▒▒▒▓▓████████▓▓▒▒██    ░░  ░░░░██▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▓▓▓▓████████░░░░██
            ██▒▒▓▓▓▓██████▓▓▓▓██▒▒██      ░░░░░░████▓▓██▒▒▒▒██▒▒▒▒████▓▓████░░░░░░██
              ████████████████▓▓▓▓██    ██░░░░░░████▓▓██▒▒██░░████▓▓██▓▓██░░██░░▒▒██
                    ██████░░████▓▓▓▓██░░░░░░░░████▓▓██▒▒▒▒████  ██████████████░░▒▒██
                    ██░░████░░██▓▓▓▓██░░░░░░████▓▓▓▓██▒▒▒▒██  ██░░██████    ██░░██  
                    ████  ░░░░████▓▓▓▓██████████▓▓████▒▒██░░  ░░░░████    ██░░██    
                      ██░░  ░░██████▓▓▓▓██████████████▒▒██  ░░░░████        ██      
                        ██░░░░▒▒████████████████████████  ░░▒▒████░░░░░░            
                    ░░░░░░██░░▒▒████████████████████████░░▒▒████░░░░░░░░░░░░░░░░    
                      ░░░░░░████░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░░░░░░░░░           

*/
package com.onomos.vrau;

import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

public class OnomosWhoosh extends ApplicationAdapter implements TextInputListener {
	SpriteBatch batch;
	Texture background, predios, mamaco, mamaco2, mamaco1wins, mamaco2wins, onomo, sol;
	Sprite sprite_predio, sprite_mamaco, sprite_mamaco2, sprite_onomo, sprite_onomo2, sprite_mamaco1wins,
			sprite_mamaco2wins, sprite_sol, sprite_background;
	Music tema;
	Sound voice1, voice2, voice3, voice4;
	Rectangle pre1, pre2, pre3, pre4, pre5, pre6, boxO1, boxO2, boxMa1, boxMa2;
	private Vector2 posBola, velBola;
	int velocity, angle, textHolder, textHolder2, voice;
	float g = 0;// gravidade
	double dt = 0;// deltaTime
	double c, s;// cosseno e seno.
	double rad = Math.toRadians(angle);
	boolean velocidade = true, angulo = true, turno = true, PT1 = false;
	Random aleatorio = new Random();
	float wind = aleatorio.nextFloat() * 1 + 1;
	private int spriteRotationSpeed = 5;

	@Override
	public void create() {
		batch = new SpriteBatch();
		background = new Texture("backgroundm.png");
		predios = new Texture("predios.png");
		mamaco = new Texture("dk.png");
		mamaco2 = new Texture("dk2.png");
		onomo = new Texture("onomo.png");
		mamaco1wins = new Texture("mamaco1wins.png");
		mamaco2wins = new Texture("mamaco2wins.png");
		sol = new Texture("sol.png");
		sprite_background = new Sprite(background, 1280, 350);
		sprite_sol = new Sprite(sol, 60, 60);
		sprite_mamaco = new Sprite(mamaco, 50, 48);
		sprite_mamaco2 = new Sprite(mamaco2, 50, 48);
		sprite_onomo = new Sprite(onomo, 22, 18);
		sprite_onomo2 = new Sprite(onomo, 22, 18);
		sprite_predio = new Sprite(predios, 640, 350);
		sprite_mamaco1wins = new Sprite(mamaco1wins, 640, 350);
		sprite_mamaco2wins = new Sprite(mamaco2wins, 640, 350);
		sprite_predio.setPosition(0, 0);
		sprite_mamaco.setPosition(47, 190);
		sprite_mamaco2.setPosition(519, 206);
		sprite_mamaco1wins.setPosition(-640, -350);
		sprite_mamaco2wins.setPosition(-640, -350);
		sprite_sol.setPosition(600, 310);
		tema = Gdx.audio.newMusic(Gdx.files.internal("tema.mp3"));
		voice1 = Gdx.audio.newSound(Gdx.files.internal("voice1.wav"));
		voice2 = Gdx.audio.newSound(Gdx.files.internal("voice2.wav"));
		voice3 = Gdx.audio.newSound(Gdx.files.internal("voice3.wav"));
		voice4 = Gdx.audio.newSound(Gdx.files.internal("voice4.wav"));

		// Musica que toca durante o jogo
		tema.setLooping(true);
		tema.setVolume(0.1f);
		tema.play();

		// Hitbox dos predios
		pre1 = new Rectangle(0, 0, 128, 190);
		pre2 = new Rectangle(129, 0, 129, 142);
		pre3 = new Rectangle(258, 0, 112, 174);
		pre4 = new Rectangle(370, 0, 113, 158);
		pre5 = new Rectangle(483, 0, 113, 206);
		pre6 = new Rectangle(596, 0, 47, 109);

		// HitBox dos mamacos
		boxMa1 = new Rectangle(47, 190, 50, 40);
		boxMa2 = new Rectangle(519, 206, 50, 40);

		// Inicia a velocidade igual a 0 para não bugar o onomo
		velocity = 0;

		// Cria o vetor que define a posicao da bola abaixo da tela
		posBola = new Vector2(47, -240);

		// Cria o vetor de velocidade da bola (onomo)
		velBola = new Vector2(0, 0);

		// HitBox dos onomos
		boxO1 = new Rectangle(posBola.x, posBola.y, sprite_onomo.getWidth(), sprite_onomo.getHeight());
		boxO2 = new Rectangle(posBola.x, posBola.y, sprite_onomo2.getWidth(), sprite_onomo2.getHeight());
	}

	@Override
	public void render() {
		// Renderiza a cena
		ScreenUtils.clear(1, 0, 0, 1);
		// Desenha os sprites
		batch.begin();
		sprite_background.draw(batch);
		sprite_predio.draw(batch);
		sprite_mamaco.draw(batch);
		sprite_mamaco2.draw(batch);
		sprite_mamaco1wins.draw(batch);
		sprite_mamaco2wins.draw(batch);
		sprite_onomo.draw(batch);
		sprite_onomo2.draw(batch);
		sprite_sol.draw(batch);
		batch.end();

		// Chama a funcao que rotaciona alguns sprites
		rotateSprite();

		// Guardam os valores de angulo e velocidade
		String ang = "";
		String vel = "";

		// Faz background se mover
		if (sprite_background.getX() > -640) {
			if (sprite_background.getX() < -639) {
				sprite_background.setPosition(0, 0);
			}
			float lastx = sprite_background.getX();
			sprite_background.setPosition(lastx - (1 * 0.2f), 0);
		}

		// Turno do MAMACO 1 (o nome dele eh Pedrada)
		if (turno == true) {
			// Detecta colisoes coms os predios, faz onomo resetar posicao e parar de se
			// mover, resetando a velocidade.
			if (boxO1.overlaps(pre1) || boxO1.overlaps(pre2) || boxO1.overlaps(pre3) || boxO1.overlaps(pre4)
					|| boxO1.overlaps(pre5) || boxO1.overlaps(pre6) || posBola.x < 0 || posBola.x > 640) {
				posBola.x = 47;
				posBola.y = -240;
				g = 0;
				dt = 0;
				velocity = 0;
				turno = false;
			}

			// Detecta colisao elimininando o MAMACO 1
			if (boxO1.overlaps(boxMa1)) {
				posBola.x = 47;
				posBola.y = -240;
				g = 0;
				dt = 0;
				velocity = 0;
				sprite_mamaco.setPosition(-100, -100);
				sprite_mamaco2wins.setPosition(0, 0);
				turno = false;
			}
			// Detecta colisao elimininando o MAMACO 2
			if (boxO1.overlaps(boxMa2)) {
				posBola.x = 47;
				posBola.y = -240;
				g = 0;
				dt = 0;
				velocity = 0;
				sprite_mamaco2.setPosition(-100, -100);
				sprite_mamaco1wins.setPosition(0, 0);
				turno = false;
			}
			// Input para inserir o angulo
			if (Gdx.input.isKeyJustPressed(Input.Keys.Z)) {
				Gdx.input.getTextInput(this, "Angulo", ang, "");

				velocidade = false;
			}
			// Input para inserir a velocidade
			if (Gdx.input.isKeyJustPressed(Input.Keys.X)) {
				Gdx.input.getTextInput(this, "Velocidade", vel, "");

				angulo = false;
			}
			// Quando inserido o angulo e a velocidade, muda a posicao do onomo para cima do
			// mamaco e faz ele comecar a se mover
			if (velocidade && angulo) {
				angle = textHolder;
				velocity = textHolder2;
				// O jogador precisa colocar o angulo antes da velocidade se nao o if acontece e
				// complica a rodada do jogador
				if (velocity > 0) {
					posBola.x = 47;
					posBola.y = 240;
				}
				g = 9.8f;
				dt = 0.2;

				voice = aleatorio.nextInt(4);
				switch (voice) {
					case 1:
						voice1.play(0.3f);
						break;
					case 2:
						voice2.play(0.3f);
						break;
					case 3:
						voice3.play(0.3f);
						break;
					case 4:
						voice4.play(0.3f);
						break;
					default:
						voice1.play(0.3f);
						break;
				}
			}
			// Inicio do calculo da simulacao do lancamento obliquo
			rad = Math.toRadians((angle - 90) * -1);
			c = Math.cos(rad);
			s = Math.sin(rad);

			if (velocidade && angulo) {
				velBola = new Vector2(velocity * (float) s, velocity * (float) c);
				velocidade = false;
				angulo = false;
			}
			// Atualiza velocidade nos dois eixos com influencia da gravidade.
			velBola.y = (float) (velBola.y - g * dt);
			posBola.x = (float) (posBola.x + (velBola.x) * dt * wind);
			posBola.y = (float) (posBola.y + (velBola.y) * dt * wind);
			// Atualiza posicao do onomo e da hitbox
			sprite_onomo.setPosition(posBola.x, posBola.y);
			sprite_onomo2.setPosition(posBola.x, posBola.y);
			boxO1.setPosition(posBola.x, posBola.y);
		}

		// Turno do MAMACO 2 (o nome dele é Zildinir)
		if (turno == false) {
			// Detecta colisoes coms os predios, faz onomo resetar posicao e parar de se
			// mover, resetando a velocidade.
			if (boxO2.overlaps(pre1) || boxO2.overlaps(pre2) || boxO2.overlaps(pre3) || boxO2.overlaps(pre4)
					|| boxO2.overlaps(pre5) || boxO2.overlaps(pre6) || posBola.x < 0 || posBola.x > 640) {
				posBola.x = 519;
				posBola.y = -256;
				g = 0;
				dt = 0;
				velocity = 0;
				turno = true;
			}
			// Detecta colisao elimininando o MAMACO 2
			if (boxO2.overlaps(boxMa2)) {
				posBola.x = 519;
				posBola.y = -256;
				g = 0;
				dt = 0;
				velocity = 0;
				sprite_mamaco2.setPosition(-100, -100);
				sprite_mamaco1wins.setPosition(0, 0);
				turno = true;
			}
			// Detecta colisao elimininando o MAMACO 1
			if (boxO2.overlaps(boxMa1)) {
				posBola.x = 519;
				posBola.y = -256;
				g = 0;
				dt = 0;
				velocity = 0;
				sprite_mamaco.setPosition(-100, -100);
				sprite_mamaco2wins.setPosition(0, 0);
				turno = true;
			}
			// Input para inserir o angulo
			if (Gdx.input.isKeyJustPressed(Input.Keys.Z)) {
				Gdx.input.getTextInput(this, "Angulo", ang, "");

				velocidade = false;
			}
			// Input para inserir a velocidade
			if (Gdx.input.isKeyJustPressed(Input.Keys.X)) {
				Gdx.input.getTextInput(this, "Velocidade", vel, "");

				angulo = false;
			}
			// Quando inserido o angulo e a velocidade, muda a posicao do onomo para cima do
			// mamaco e faz ele comecar a se mover
			if (velocidade && angulo) {
				angle = textHolder;
				velocity = textHolder2;
				// O jogador precisa colocar o angulo antes da velocidade se nao o if acontece e
				// complica a rodada do jogador
				if (velocity > 0) {
					posBola.x = 519;
					posBola.y = 256;
				}
				g = 9.8f;
				dt = 0.2;

				voice = aleatorio.nextInt(4);
				switch (voice) {
					case 1:
						voice1.play(0.3f);
						break;
					case 2:
						voice2.play(0.3f);
						break;
					case 3:
						voice3.play(0.3f);
						break;
					case 4:
						voice4.play(0.3f);
						break;
					default:
						voice1.play(0.3f);
						break;
				}
			}
			// Inicio do calculo da simulacao do lançamento obliquo
			rad = Math.toRadians((angle - 90));
			c = Math.cos(rad);
			s = Math.sin(rad);

			if (velocidade && angulo) {
				velBola = new Vector2(velocity * (float) s, velocity * (float) c);
				velocidade = false;
				angulo = false;
			}
			// Atualiza velocidade nos dois eixos com influencia da gravidade.
			velBola.y = (float) (velBola.y - g * dt);
			posBola.x = (float) (posBola.x + (velBola.x) * dt * wind);
			posBola.y = (float) (posBola.y + (velBola.y) * dt * wind);
			// Atualiza posicao do onomo e da hitbox
			sprite_onomo2.setPosition(posBola.x, posBola.y);
			boxO2.setPosition(posBola.x, posBola.y);
		}
	}

	// Funcao que rotaciona os onomos no ar e os Sol
	private void rotateSprite() {

		float rotation = sprite_onomo.getRotation();
		rotation += spriteRotationSpeed;
		if (rotation > 360)
			rotation -= 360;
		sprite_onomo.setRotation(rotation);

		float rotation2 = sprite_onomo2.getRotation();
		rotation2 += spriteRotationSpeed;
		if (rotation > 360)
			rotation -= 360;
		sprite_onomo2.setRotation(rotation2);

		float rotation3 = sprite_sol.getRotation();
		rotation3 += spriteRotationSpeed / 5;
		if (rotation > 360)
			rotation -= 360;
		sprite_sol.setRotation(rotation3);
	}

	// Destroi quando fecha o programa
	@Override
	public void dispose() {
		batch.dispose();
		tema.dispose();
		voice1.dispose();
		voice2.dispose();
		voice3.dispose();
		voice4.dispose();
	}

	// Converte String inserida no input em int para definir angulo e velocidade do
	// lancamento.
	@Override
	public void input(String text) {
		// Detecta se estah sendo inserido velocidade ou angulo.
		if (velocidade == true) {
			angulo = true;
			textHolder2 = Integer.parseInt(text);
		}
		if (velocidade == false) {
			velocidade = true;
			textHolder = Integer.parseInt(text);
		}
	}

	// metodo gerado pelo import do TextInputListener
	@Override
	public void canceled() {

	}
}
