package br.com.viniciusprojetos.jogodavelha.inteligencia;

import android.widget.Button;

import java.util.List;
import java.util.Random;

/**
 * Created by vinicius on 18/09/17.
 */

public class Regras {
        static int answer;
        static Random rn = new Random();
        List<Button> btns;

    public Regras(List<Button> btns) {
        this.btns = btns;
    }

        public Button tentarVencer() {
            if (btns.get(0).getText().equals("O")) {
                if (btns.get(1).getText().equals("O")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
                if (btns.get(2).getText().equals("O")) {
                    if (btns.get(1).getText().equals("")) {
                        return btns.get(1);
                    }
                }
                if (btns.get(3).getText().equals("O")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(6).getText().equals("O")) {
                    if (btns.get(3).getText().equals("")) {
                        return btns.get(3);
                    }
                }
                if (btns.get(8).getText().equals("O")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
            }
            if (btns.get(1).getText().equals("O")) {
                if (btns.get(2).getText().equals("O")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                }
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(7).getText().equals("")) {
                        return btns.get(7);
                    }
                }
                if (btns.get(7).getText().equals("O")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
            }
            if (btns.get(2).getText().equals("O")) {
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
                if (btns.get(5).getText().equals("O")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(6).getText().equals("O")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
                if (btns.get(8).getText().equals("O")) {
                    if (btns.get(5).getText().equals("")) {
                        return btns.get(5);
                    }
                }
            }
            if (btns.get(3).getText().equals("O")) {
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(5).getText().equals("")) {
                        return btns.get(5);
                    }
                }
                if (btns.get(5).getText().equals("O")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
                if (btns.get(6).getText().equals("O")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                }
            }
            if (btns.get(5).getText().equals("O")) {
                if (btns.get(8).getText().equals("O")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(3).getText().equals("")) {
                        return btns.get(3);
                    }
                }
            }
            if (btns.get(6).getText().equals("O")) {
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
                if (btns.get(7).getText().equals("O")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(8).getText().equals("O")) {
                    if (btns.get(7).getText().equals("")) {
                        return btns.get(7);
                    }
                }
            }
            if (btns.get(7).getText().equals("O")) {
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(1).getText().equals("")) {
                        return btns.get(1);
                    }
                }
                if (btns.get(8).getText().equals("O")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
            }
            if (btns.get(8).getText().equals("O")) {
                if (btns.get(4).getText().equals("O")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                }
            }
            return null;
        }

        public Button impedirVitoria() {
            if (btns.get(0).getText().equals("X")) {
                if (btns.get(1).getText().equals("X")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
                if (btns.get(2).getText().equals("X")) {
                    if (btns.get(1).getText().equals("")) {
                        return btns.get(1);
                    }
                }
                if (btns.get(3).getText().equals("X")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(6).getText().equals("X")) {
                    if (btns.get(3).getText().equals("")) {
                        return btns.get(3);
                    }
                }
                if (btns.get(8).getText().equals("X")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
            }
            if (btns.get(1).getText().equals("X")) {
                if (btns.get(2).getText().equals("X")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                }
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(7).getText().equals("")) {
                        return btns.get(7);
                    }
                }
                if (btns.get(7).getText().equals("X")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
            }
            if (btns.get(2).getText().equals("X")) {
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
                if (btns.get(5).getText().equals("X")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(6).getText().equals("X")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
                if (btns.get(8).getText().equals("X")) {
                    if (btns.get(5).getText().equals("")) {
                        return btns.get(5);
                    }
                }
            }
            if (btns.get(3).getText().equals("X")) {
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(5).getText().equals("")) {
                        return btns.get(5);
                    }
                }
                if (btns.get(5).getText().equals("X")) {
                    if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                }
                if (btns.get(6).getText().equals("X")) {
                    if (btns.get(0).getText().equals("")) {
                        btns.get(0).setText("O");
                        return btns.get(0);
                    }
                }
            }
            if (btns.get(5).getText().equals("X")) {
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(3).getText().equals("")) {
                        return btns.get(3);
                    }
                }
                if (btns.get(8).getText().equals("X")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
            }
            if (btns.get(6).getText().equals("X")) {
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
                if (btns.get(7).getText().equals("X")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(8).getText().equals("X")) {
                    if (btns.get(7).getText().equals("")) {
                        return btns.get(7);
                    }
                }
            }
            if (btns.get(7).getText().equals("X")) {
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(1).getText().equals("")) {
                        return btns.get(1);
                    }
                }
                if (btns.get(8).getText().equals("X")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
            }
            if (btns.get(8).getText().equals("X")) {
                if (btns.get(4).getText().equals("X")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                }
            }
            return null;
        }

        public Button iniciandoJogo() {
            //comecando o jogo
            if (btns.get(0).getText().equals("") && btns.get(1).getText().equals("") && btns.get(2).getText().equals("") && btns.get(3).getText().equals("") && btns.get(4).getText().equals("") && btns.get(5).getText().equals("") && btns.get(6).getText().equals("") && btns.get(7).getText().equals("") && btns.get(8).getText().equals("")) {
                answer = rn.nextInt(5) + 1;
                switch(answer) {
                    case 1:if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                    case 2:if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                    case 3:if (btns.get(4).getText().equals("")) {
                        return btns.get(4);
                    }
                    case 4:if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                    case 5:if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
            }

            //se meio vazio, jogar no meio
            if (btns.get(4).getText().equals("")) {
                return btns.get(4);
            }

            //se oponente jogar no meio, joga em um dos cantos
            if (btns.get(4).getText().equals("X") && btns.get(0).getText().equals("") && btns.get(2).getText().equals("") && btns.get(6).getText().equals("") && btns.get(8).getText().equals("")) {
                answer = rn.nextInt(4) + 1;
                switch(answer) {
                    case 1:if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                    case 2:if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                    case 3:if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                    case 4:if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
            }
            return null;
        }

        public Button defesaJogo() {
            //impedir chance dupla de vitoria no proximo round
            if (btns.get(4).getText().equals("X")) {
                if (btns.get(0).getText().equals("X") && btns.get(8).getText().equals("O")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
                if (btns.get(2).getText().equals("X") && btns.get(6).getText().equals("O")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(6).getText().equals("X") && btns.get(2).getText().equals("O")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(8).getText().equals("X") && btns.get(0).getText().equals("O")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
            }
            //impedir chance de dupla vitoria 2
            if (btns.get(4).getText().equals("O")) {
                if (btns.get(0).getText().equals("X") && btns.get(8).getText().equals("X")) {
                    answer = rn.nextInt(4) + 1;
                    switch(answer) {
                        case 1:if (btns.get(1).getText().equals("")) {
                            return btns.get(1);
                        }
                        case 2:if (btns.get(3).getText().equals("")) {
                            return btns.get(3);
                        }
                        case 3:if (btns.get(5).getText().equals("")) {
                            return btns.get(5);
                        }
                        case 4:if (btns.get(7).getText().equals("")) {
                            return btns.get(7);
                        }
                    }
                }
                if (btns.get(2).getText().equals("X") && btns.get(6).getText().equals("X")) {
                    answer = rn.nextInt(4) + 1;
                    switch(answer) {
                        case 1:if (btns.get(1).getText().equals("")) {
                            return btns.get(1);
                        }
                        case 2:if (btns.get(3).getText().equals("")) {
                            return btns.get(3);
                        }
                        case 3:if (btns.get(5).getText().equals("")) {
                            return btns.get(5);
                        }
                        case 4:if (btns.get(7).getText().equals("")) {
                            return btns.get(7);
                        }
                    }
                }
            }
            return null;
        }

        public Button ataqueJogo() {
            //tentativa de dupla chance de vitoria
            if (btns.get(4).getText().equals("O")) {
                if (btns.get(0).getText().equals("X") && btns.get(8).getText().equals("")) {
                    return btns.get(8);
                }
                if (btns.get(8).getText().equals("X") && btns.get(0).getText().equals("")) {
                    return btns.get(0);
                }
                if (btns.get(2).getText().equals("X") && btns.get(6).getText().equals("")) {
                    return btns.get(6);
                }
                if (btns.get(6).getText().equals("X") && btns.get(2).getText().equals("")) {
                    return btns.get(2);
                }
            }

            //cria possibilidade de vitoria, impedindo chance dupla de vitoria do adversario
            if (btns.get(4).getText().equals("O")) {
                if (btns.get(1).getText().equals("X") && btns.get(3).getText().equals("X")) {
                    if (btns.get(0).getText().equals("")) {
                        return btns.get(0);
                    }
                }
                if (btns.get(3).getText().equals("X") && btns.get(7).getText().equals("X")) {
                    if (btns.get(6).getText().equals("")) {
                        return btns.get(6);
                    }
                }
                if (btns.get(5).getText().equals("X") && btns.get(7).getText().equals("X")) {
                    if (btns.get(8).getText().equals("")) {
                        return btns.get(8);
                    }
                }
                if (btns.get(5).getText().equals("X") && btns.get(1).getText().equals("X")) {
                    if (btns.get(2).getText().equals("")) {
                        return btns.get(2);
                    }
                }
            }
            //Terminar jogo
            answer = 1;
            switch(answer) {
                case 1:if (btns.get(0).getText().equals("")) {
                    return btns.get(0);
                }
                else
                    answer++;
                case 2:if (btns.get(1).getText().equals("")) {
                    return btns.get(1);
                }
                else
                    answer++;
                case 3:if (btns.get(2).getText().equals("")) {
                    return btns.get(2);
                }
                else
                    answer++;
                case 4:if (btns.get(3).getText().equals("")) {
                    return btns.get(3);
                }
                else
                    answer++;
                case 5:if (btns.get(4).getText().equals("")) {
                    return btns.get(4);
                }
                else
                    answer++;
                case 6:if (btns.get(5).getText().equals("")) {
                    return btns.get(5);
                }
                else
                    answer++;
                case 7:if (btns.get(6).getText().equals("")) {
                    return btns.get(6);
                }
                else
                    answer++;
                case 8:if (btns.get(7).getText().equals("")) {
                    return btns.get(7);
                }
                else
                    answer++;
                case 9:if (btns.get(8).getText().equals("")) {
                    return btns.get(8);
                }
            }
            return null;
        }

        public Button getBtVazio() {
            int j, i = 0;
            for (j = 0; j < btns.size(); j++) {
                //i = geraNum();
                if (btns.get(j).getText().toString().isEmpty())
                    break;
            }
            return btns.get(i);
        }

    }

