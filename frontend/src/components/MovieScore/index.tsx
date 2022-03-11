import MovieStars from "components/MovieStars/Index";
import './styles.css';

function MovieScore() {

    const score = 3.5;
    const count = 13;

    return (
        <div className="plmovie-score-container">
            <p className="plmovie-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <MovieStars />
            <p className="plmovie-score-count">{count} avaliações</p>
        </div>
    );
}

export default MovieScore;