import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import './styles.css'

function Pagination() {
    return (
        <div className="plmovie-pagination-container">
            <div className="plmovie-pagination-box">
                <button className="plmovie-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${3}`}</p>
                <button className="plmovie-pagination-button" disabled={false} >
                    <Arrow className="plmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;