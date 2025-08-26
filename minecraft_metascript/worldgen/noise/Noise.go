package noise

import (
	"math"
	"strconv"

	"github.com/itsmebriand/mms/mms/grammars"
)

type Noise struct {
	FirstOctave float64   `json:"firstOctave"`
	Amplitudes  []float64 `json:"amplitudes"`
}

func NewNoise(ctx *grammars.NoiseDefinitionContext) (*Noise, error) {
	firstOctave, err := strconv.ParseFloat(ctx.AllNumber()[0].GetText(), 64)
	if err != nil {
		return nil, err
	}
	additionalOctaves := make([]float64, 0)
	for _, octave := range ctx.AllNumber()[1:] {
		val, err := strconv.ParseFloat(octave.GetText(), 32)
		val = math.Round(val*1e6) / 1e6

		if err != nil {
			return nil, err
		}
		additionalOctaves = append(additionalOctaves, float64(val))
	}

	return &Noise{
		FirstOctave: firstOctave,
		Amplitudes:  additionalOctaves,
	}, nil

}
